import React from 'react';
import ReactDOM from 'react-dom';
import axios from 'axios';

export default class Employee extends React.Component {
  state = {
    employees: []
  }

  componentDidMount() {
    axios.get(`http://localhost:3000/employee`)
      .then(res => {
        const employees = res.data;
        console.log(res.data);
        this.setState({ employees });
      })
  }

  render() {
    return (
      <div>
        <table class="table">
          <thead>
            <label>Danh sach nhan vien</label>
            <div>
              <span>
                <input class="form-control py-2" type="search" id="example-search-input" />
                <button class="btn btn-outline-secondary" type="button">
                  <i class="fa fa-search"></i>
                </button>
              </span>
              <button>
                <i class="fa fa-plus-circle" aria-hidden="true"></i>
                Them
              </button>
            </div>
          </thead>
          <thead>
            <tr>
              <th scope="col">ID</th>
              <th scope="col">Name</th>
              <th scope="col">BirthDay</th>
              <th scope="col">Gender</th>
              <th scope="col">Address</th>
            </tr>
          </thead>
          <tbody>
            <tr>
              <th scope="row">{this.state.employees.map(employee => <p>{employee.id}</p>)}</th>
              <td>{this.state.employees.map(employee => <p>{employee.name}</p>)}</td>
              <td>{this.state.employees.map(employee => <p>{employee.birthDay}</p>)}</td>
              <td>{this.state.employees.map(employee => <p>{employee.gender}</p>)}</td>
              <td>{this.state.employees.map(employee => <p>{employee.address}</p>)}</td>
            </tr>
          </tbody>
          <tbody>
            <tr>
              <button>xoa</button>
            </tr>
          </tbody>
        </table>
      </div>

    );
  }
}


// import React from 'react';
// import 'bootstrap/dist/css/bootstrap.css';
// import axios from 'axios';

// export default class Employee extends React.Component {
//     state = {
//       employees: []
//     }

  

//   componentDidMount() {
//     axios.get(`http://localhost:3000/employee`)
//       .then(res => {
//         const employees = res.data;
//         console.log(res.data);
//         this.setState({ employees });
//       });
//   }

//   render() {
//     return (
//       <div className="container">
//         <div className="row">
//           <div className="col-md-4">
//             <div className="form-group">
//               <label>Name</label>
//               <input type="text" name="" className="form-control" />
//             </div>
//             <div className="form-group">
//               <label>Price</label>
//               <input type="text" name="" className="form-control" />
//             </div>
//             <div className="form-group">
//               <button type="button" className="btn btn-primary">Add</button>
//             </div>
//           </div>

//           <div className="col-md-8">
//             <h1>Danh sach nhan vien</h1>
//             <table className="table">
//               <thead>
//                 <tr>
//                   <th scope="col">ID</th>
//                   <th scope="col">Name</th>
//                   <th scope="col">BirthDay</th>
//                   <th scope="col">Gender</th>
//                   <th scope="col">Address</th>
//                 </tr>
//                 <tbody>
//                   <tr>
//                     <th scope="row">{this.state.employees.map(employee => <p>{employee.id}</p>)}</th>
//                     <td>{this.state.employees.map(employee => <p>{employee.name}</p>)}</td>
//                     <td>{this.state.employees.map(employee => <p>{employee.birthDay}</p>)}</td>
//                     <td>{this.state.employees.map(employee => <p>{employee.gender}</p>)}</td>
//                     <td>{this.state.employees.map(employee => <p>{employee.address}</p>)}</td>
//                   </tr>
//                 </tbody>
//               </thead>
//               <tbody>

//                 <tr>
//                   <td><label className="badge badge-warning">modify</label></td>
//                   <td><label className="badge badge-danger">remove</label></td>
//                 </tr>

//               </tbody>
//             </table>
//           </div>
//         </div>
//       </div>
//     );
//   }

// }
