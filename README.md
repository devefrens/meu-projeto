# 📦 Como Criar e Subir um Repositório no GitHub

Este passo a passo te ensina a criar um repositório local com Git e enviá-lo (fazer o "push") para o GitHub.

---

## ✅ Pré-requisitos

- Ter uma conta no [GitHub](https://github.com/)
- Git instalado no seu computador (verifique com `git --version`)

---

## 🛠️ 1. Criar o repositório no GitHub

1. Acesse [https://github.com/](https://github.com/)
2. Clique em **New repository** ou no botão `+` → **New repository**
3. Preencha as informações:
   - **Nome** do repositório (ex: `meu-projeto`)
   - **Descrição** (opcional)
   - Selecione **Public** ou **Private**
   - Deixe as opções (README, .gitignore) desmarcadas
4. Clique em **Create repository**

---

## 🖥️ 2. Criar o projeto localmente e enviar para o GitHub

Abra o terminal (Git Bash, cmd, PowerShell ou terminal do VSCode):

```bash
# Navegue até a pasta onde deseja criar o projeto
cd caminho/para/sua/pasta

# Crie a pasta do projeto (se necessário)
mkdir meu-projeto
cd meu-projeto

# Inicie o repositório Git
git init

# Crie um arquivo inicial (opcional)
echo "# Meu Projeto" > README.md

# Adicione os arquivos
git add .

# Faça o commit inicial
git commit -m "Primeiro commit"

# Adicione o repositório remoto (copie do GitHub)
git remote add origin https://github.com/seu-usuario/meu-projeto.git

# Envie os arquivos para o GitHub
git push -u origin master   # ou use 'main' se for o branch padrão

