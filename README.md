# End-to-End DevSecOps & GitOps Pipeline

An end-to-end DevSecOps learning project implementing security scanning, CI/CD automation, containerization, and GitOps deployment for five Python/Django applications.

## Applications

This repository contains five Django applications:

- Mediplus
- Project4
- Complaintbox
- Takecare
- Villa

Each application has its own Docker configuration, Jenkins pipeline, and Kubernetes manifests.

## Architecture

```text
             Developer
                 |
                 v
          Source Code Push
            (Gitea / GitHub)
                 |
                 v
          Jenkins CI Pipeline
                 |
       +---------+----------+
       |         |          |
       v         v          v
    Semgrep    Trivy     Build Docker
     SAST    SCA/Secrets    Image
                            |
                            v
                       Docker Hub
                            |
                            v
                    Kubernetes / Minikube
                            |
                            v
                     Argo CD GitOps
                            |
                            v
                      Application
```

OWASP ZAP is used separately for Dynamic Application Security Testing (DAST) against running applications.

## Technology Stack

| Category | Tools |
|---|---|
| Applications | Python, Django, HTML, CSS, JavaScript, Bootstrap |
| Source control | Git, Gitea, GitHub |
| CI/CD | Jenkins |
| SAST | Semgrep |
| Dependency and secret scanning | Trivy |
| DAST | OWASP ZAP |
| Containerization | Docker |
| Container registry | Docker Hub |
| Orchestration | Kubernetes, Minikube |
| GitOps | Argo CD |

## Repository Structure

```text
EndToEnd-DevSecOps/
│
├── mediplus/
├── project4/
├── complaintbox/
├── takecare/
├── villa/
│
├── evidence/
│   ├── mediplus/
│   ├── project4/
│   ├── complaintbox/
│   ├── takecare/
│   └── villa/
│
├── screenshots/
│   ├── mediplus/
│   ├── project4/
│   ├── complaintbox/
│   ├── takecare/
│   └── villa/
│
├── .gitignore
└── README.md
