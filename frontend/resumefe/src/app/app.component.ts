
import { ApiService } from './api.service';
import { HttpClient } from '@angular/common/http';
import { Component, OnInit, ViewChild } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { NgbModal } from '@ng-bootstrap/ng-bootstrap';

import { FormBuilder, FormGroup, Validators } from '@angular/forms';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  @ViewChild('trainerDataDisplay') trainerDataDisplay: any;
  user:any={}
  constructor(private modalService: NgbModal,private api: ApiService,
    private activatedRoute: ActivatedRoute,
    private http: HttpClient,
    private fb: FormBuilder, ) { }
  ngOnInit(): void {
    this.getdetails();
    
  }
  
  title = 'resumefe';
  getdetails()
  {
    console.log("hi");
    
    this.http.get(this.api.details).subscribe((users: any)=>{
      if (users) {
        this.user=users;
        console.log(this.user.fullname);

      }

    })
  }
  traineeData:any;
  userForm = this.fb.group({
    fullname: ['', Validators.compose([Validators.required])],
    email: ['', Validators.compose([Validators.required])],
    mobile: ['', Validators.compose([Validators.required])],
  });
  openVerticallyCentered(content:any) {
    this.userForm.get('fullname')?.setValue(this.user.fullname);
    this.userForm.get('email')?.setValue(this.user.email);
    this.userForm.get('mobile')?.setValue(this.user.mobile);
    this.modalService.open(content, { centered: true });
  }
  UpdateData(){
    this.http.get(this.api.updateDetails +"/"+this.userForm.get("fullname")?.value+"/"+this.userForm.get("email")?.value+"/"+this.userForm.get("mobile")?.value).subscribe((users: any) => {
      this.modalService.dismissAll();
      this.getdetails();
         })
  }
  
  get f() {
    // console.log(this.userForm.controls);    
    return this.userForm.controls;
  }
}
