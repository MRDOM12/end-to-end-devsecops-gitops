# End-to-End DevSecOps & GitOps Pipeline (5 Django Applications)

An automated, security-first CI/CD and GitOps deployment architecture built for five Python/Django web applications (\mediplus\, \illa\, \	akecare\, \complaintbox\, and \project4\).

## Architecture & Pipeline Flow
\\\
Git Push (Gitea / GitHub)
   │
   ▼
Jenkins CI/CD Pipeline
   ├── 1. SAST (Semgrep: p/python, p/django)
   ├── 2. SCA & Secret Scan (Trivy: vuln, secret)
   └── 3. Container Build & Push (Docker -> Docker Hub)
   │
   ▼
DAST Verification (OWASP ZAP Baseline Scan)
   │
   ▼
GitOps Continuous Delivery (ArgoCD -> Kubernetes / Minikube)
\\\

## Tech Stack
* **Applications:** Python 3.12, Django 4.2, Gunicorn, WhiteNoise, Bootstrap
* **Security Gates:** Semgrep (SAST), Trivy (Dependency & Secret Scanning), OWASP ZAP (DAST)
* **CI/CD & Source Control:** Jenkins Declarative Pipelines, Gitea, GitHub
* **Containers & Orchestration:** Docker, Docker Hub, Kubernetes (Minikube), ArgoCD

## Repository Structure
* \mediplus/\, \illa/\, \	akecare/\, \complaintbox/\, \project4/\ — Containerized Django applications with \Dockerfile\, \Jenkinsfile\, and \k8s/\ manifests (\Deployment\ & \Service\).
* \evidence/\ — Raw SAST, SCA, and DAST scan reports across all 5 applications.
* \screenshots/\ — Verification evidence covering SAST, Dependency Scan, DAST, Jenkins Pipeline Setup, Green Stage Execution, and ArgoCD \Healthy & Synced\ deployments.
