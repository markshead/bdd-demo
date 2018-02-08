import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { CounterService } from './counter.service';
import { AdderService } from './adder.service';
import { AppComponent } from './app.component';
import { RequestInterceptor } from './request-interceptor';

export const httpInterceptorProviders = [
    { provide: HTTP_INTERCEPTORS, useClass: RequestInterceptor, multi: true },
];

@NgModule({
    declarations: [
        AppComponent
    ],
    imports: [
        BrowserModule, HttpClientModule, FormsModule
    ],
    
    providers: [CounterService, AdderService, httpInterceptorProviders ],
    bootstrap: [AppComponent]
})
export class AppModule { }
