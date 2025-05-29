# Workflows x Actions no GitHub Actions

## Diferença entre Workflow e Action

- **Workflow:**  
  Arquivo de automação que define quando e como um pipeline será executado. Contém jobs compostos por etapas (steps) que usam actions.

- **Action:**  
  Bloco reutilizável que executa uma tarefa específica dentro de um workflow, como checkout do código, configuração do Java, testes ou análise de segurança.

---

## 🗂️ Estrutura de uma Action

Uma action é definida por um arquivo chamado **`action.yml`**, que contém:

- **Inputs:** parâmetros que ela recebe
- **Outputs:** valores que ela retorna (opcional)
- **Runs:** como ela executa (Node.js, Docker ou comandos shell)

Exemplo básico de um `action.yml`:

```yaml
name: Minha Action
description: Diz olá
inputs:
  nome:
    description: 'Nome para exibir'
    required: true
runs:
  using: "composite"
  steps:
    - run: echo "Olá ${{ inputs.nome }}"
```


