# Manual rápido de Git en Bash

Este documento es un resumen práctico para aprender a usar **Git desde la terminal (Git Bash)**.  

---

## 🚀 Flujo básico para subir cambios

1. **Ubícate en la carpeta del proyecto**  
   - Abre el explorador, clic derecho → **Git Bash Here**.  

2. **Verifica el estado**  
   ```bash
   git status
   ```

3. **Agrega cambios**  
   ```bash
   git add .
   # o para un archivo en específico
   git add archivo.java
   ```

4. **Crea el commit**  
   ```bash
   git commit -m "Describe el cambio"
   ```

5. **Sube al remoto (GitHub)**  
   ```bash
   git push -u origin main
   # si tu rama es master
   git push -u origin master
   ```

---

## 🌿 Ramas (branching)

- Crear rama:  
  ```bash
  git branch feat/menu
  git switch -c feat/menu   # atajo moderno
  ```

- Cambiar de rama:  
  ```bash
  git checkout feat/menu
  ```

- Subir nueva rama:  
  ```bash
  git push -u origin feat/menu
  ```

- Fusionar cambios a main:  
  ```bash
  git checkout main
  git pull
  git merge feat/menu
  ```

---

## 🛑 Problemas de autenticación (HTTPS)

Si ves errores como *"Password authentication is not supported"* o *"Authentication failed"*, prueba:

### A) Login por navegador (recomendado)
```bash
git config --global credential.helper manager
git credential-manager erase https://github.com
git push -u origin main
```
Se abrirá el navegador para iniciar sesión en GitHub.

### B) Usar un Personal Access Token (PAT)
1. En GitHub → **Settings → Developer settings → Tokens** → crear nuevo token con alcance **repo**.  
2. Copia el token.  
3. Haz el push:  
   ```bash
   git push -u origin main
   ```
   Usuario = tu usuario de GitHub.  
   Contraseña = el token.

---

## ⚡ Diagnóstico rápido

- Ver carpeta raíz del repo:  
  ```bash
  git rev-parse --show-toplevel
  ```
- Ver ramas y remotos:  
  ```bash
  git branch -vv
  git remote -v
  ```

---

## 🔧 Alias útiles

```bash
git config --global alias.lg "log --oneline --graph --decorate --all"
git config --global alias.st "status -sb"
git config --global alias.co checkout
git config --global alias.ci commit
```

---

✍️ **Tip:** Haz commits pequeños y claros. Usa ramas (`feat/`, `fix/`, `docs/`) y sincroniza con `git pull` antes de trabajar.
