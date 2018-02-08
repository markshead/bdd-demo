import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/Observable';

@Injectable()
export class CounterService {

    constructor(private http: HttpClient) { }

    getCounter(): Observable<number> {
        return this.http.get<number>("/counter")
    }

}
