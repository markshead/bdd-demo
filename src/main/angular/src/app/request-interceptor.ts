import {Injectable} from '@angular/core';
import { HttpEvent, HttpInterceptor,
         HttpHandler, HttpRequest} from '@angular/common/http';
import { Observable } from 'rxjs/Observable';
import {PlatformLocation } from '@angular/common';

@Injectable()
export class RequestInterceptor implements HttpInterceptor {

    isTestURL: boolean

    constructor(private platformLocation: PlatformLocation){
        this.isTestURL = (this.platformLocation as any).location
            .href.indexOf("://localhost:4200") != -1;
    }

    redirectToTestServer(req: HttpRequest<any>): HttpRequest<any> {
        return req.clone({url: "http://localhost:8080" + req.url});
    }

    intercept(req: HttpRequest<any>, next: HttpHandler)
    : Observable<HttpEvent<any>> {
        if(this.isTestURL){
            return next.handle(this.redirectToTestServer(req));
        }else {
            return next.handle(req);
        }
    }
}
