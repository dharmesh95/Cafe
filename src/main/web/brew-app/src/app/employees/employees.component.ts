import { Component, OnInit } from "@angular/core";
import { EmployeeService } from "../employee.service";

@Component({
  selector: "app-employees",
  templateUrl: "./employees.component.html",
  styleUrls: ["./employees.component.css"]
})
export class EmployeesComponent implements OnInit {
  employees;

  constructor(private empService: EmployeeService) {}

  ngOnInit() {
    this.empService.getEmployees().subscribe(data => {
      console.log(data);
      this.employees = data;
    });
  }
}
