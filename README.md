# Expense Tracker REST API

A secure REST API for tracking personal expenses, built with Java and Spring Boot. The application supports user authentication, expense management, and persistent data storage.

**Live API:** https://expense-tracker-api-production-e043.up.railway.app

## What It Does

- Register and login with JWT authentication
- Create, view, update, and delete expenses
- All expense endpoints are protected - you need a valid token

## Built With

- Java 17
- Spring Boot
- Spring Security (JWT)
- PostgreSQL
- Deployed on Railway

## Endpoints

**Auth:**
- POST /auth/register - create account
- POST /auth/login - get token

**Expenses (need token):**
- GET /expenses - list all
- GET /expenses/{id} - get one
- POST /expenses - create
- PUT /expenses/{id} - update
- DELETE /expenses/{id} - delete

## Run Locally

./mvnw spring-boot:run

Then visit http://localhost:8080
