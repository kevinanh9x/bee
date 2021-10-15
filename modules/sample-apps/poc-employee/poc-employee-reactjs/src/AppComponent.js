import React from "react";
import ReactDOM from "react-dom";
import EmployeeContextProvider from "./components/crudemployee/context/EmployeeContext";
import EmployeeList from "./components/crudemployee/EmployeeList";

export default class AppComponent extends React.Component {
  // state = {
  //   persons: []
  // }

  // componentDidMount() {
  //   axios.get(`http://localhost:8080/o/dogoo/employee-rest-builder/v1.0/employees/`,
  // {headers: {
  //           'Accept': "application/json",
  //            'dogoo-x-user-context-request': "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJER19DVFgiLCJ1c2VySWQiOjM3NzM4LCJ1c2VyTmFtZSI6InRlc3QiLCJlbWFpbCI6ImFuaG50QGRvZ29vLnZuIiwicm9sZXMiOiJBZG1pbmlzdHJhdG9yLFBvd2VyIFVzZXIsVXNlciIsImV4cCI6MTYzNDE4OTA3N30.6h9yxiJVd3ecFZSjtwJR2FS_vQ9ku2AuGJj6E90qtGs",
  //         },})
  //     .then(res => {
  //       const persons = res.data;
  //       console.log(res.data);
  //       this.setState({ persons });
  //     })
  // }

  render() {
    return (
      <div>
        {/* <ul>
        { this.state.persons.map(person => <li>{person.name}</li>)}
      </ul> */}
        {/* <Employee /> */}
        <EmployeeContextProvider>
          <EmployeeList />
        </EmployeeContextProvider>
      </div>
    );
  }
}
