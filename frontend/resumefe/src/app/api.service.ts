import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http';
import { Observable, throwError } from 'rxjs';
import { retry, catchError } from 'rxjs/operators';
@Injectable({
    providedIn: 'root'
  })
  export class ApiService {
  
    constructor(private http: HttpClient) { }

  baseurl='http://localhost:8080'
  public details=this.baseurl+'/getDetails';
  public  updateDetails=this.baseurl+'/update';
  }