
![CI Pipeline](https://github.com/iasmimsilveira/devcalc-api/actions/workflows/ci.yml/badge.svg)

# DevCalc API

API REST simples para operações matemáticas básicas.

## Objetivo

Simular um pipeline de CI/CD com GitHub Actions, aplicando testes, build, empacotamento e deploy.

## Ferramentas

- Linguagem: Java
- Framework: Javalin
- Build: Maven

## Como executar localmente

```bash
git clone https://github.com/seu-usuario/devcalc-api.git
cd devcalc-api
mvn clean install
mvn exec:java -Dexec.mainClass="com.devcalc.App"
```
