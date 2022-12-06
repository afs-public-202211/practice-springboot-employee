GET /employees | Get all employees

GET /employees/1 | Get employee id = 1

GET /employees?gender=male | Get male employee
{
"id": 5,
"name": "Lily",
"age": 20,
"gender": "Female",
"salary": 8000
}

POST /employees | add an employee


PUT /employees | update an employee

DELETE /employees | delete an employee

GET /employees?page=1&pageSize=5 | page query, page equals 1, page size equal 5