import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';
import { Observable } from 'rxjs/Observable';

@Injectable()
export class AdderService {

    constructor(private http: HttpClient) { }

    add(firstNumber: number, secondNumber: number): Observable<number> {
        let params = new HttpParams().set("firstNumber", ""+firstNumber)
            .set("secondNumber", ""+secondNumber);

        return this.http.post<number>(
            "/adder", {}, {params : params});
    }

}
