import { Component, OnInit } from '@angular/core';
import { CounterService } from './counter.service';
import { AdderService } from './adder.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
    counter: number
    
    constructor(private counterService: CounterService,
                private adderService: AdderService){}

    ngOnInit(){
        this.getCounter();
    }

    getCounter(): void {
        this.counterService.getCounter()
            .subscribe(counter => this.counter = counter);
    }

    firstNumber: number = 0;
    secondNumber: number = 0;
    sum: number;

    add(): void {
        this.adderService.add(this.firstNumber, this.secondNumber)
            .subscribe(sum => this.sum = sum);
    }

}
