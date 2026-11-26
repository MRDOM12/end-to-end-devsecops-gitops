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
│   ├── admin_app/
│   ├── mediplus/
│   ├── static/
│   ├── templates/
│   ├── user_app/
│   ├── k8s/
│   │   ├── deployment.yaml
│   │   └── service.yaml
│   ├── .dockerignore
│   ├── .gitignore
│   ├── .semgrepignore
│   ├── Dockerfile
│   ├── Jenkinsfile
│   ├── manage.py
│   └── requirements.txt
│
├── project4/
│   ├── project4/
│   │   ├── project4/
│   │   ├── app1/
│   │   ├── static/
│   │   ├── templates/
│   │   └── manage.py
│   ├── k8s/
│   │   ├── deployment.yaml
│   │   └── service.yaml
│   ├── .dockerignore
│   ├── .gitignore
│   ├── .semgrepignore
│   ├── Dockerfile
│   ├── Jenkinsfile
│   └── requirements.txt
│
├── complaintbox/
│   ├── complaint_app/
│   ├── complaint_box/
│   ├── static/
│   ├── templates/
│   ├── k8s/
│   │   ├── deployment.yaml
│   │   └── service.yaml
│   ├── .dockerignore
│   ├── .gitignore
│   ├── .semgrepignore
│   ├── Dockerfile
│   ├── Jenkinsfile
│   ├── manage.py
│   └── requirements.txt
│
├── takecare/
│   ├── doctor/
│   ├── lab/
│   ├── patient/
│   ├── pharmacy/
│   ├── static/
│   ├── takecare/
│   ├── templates/
│   ├── k8s/
│   │   ├── deployment.yaml
│   │   └── service.yaml
│   ├── .dockerignore
│   ├── .gitignore
│   ├── .semgrepignore
│   ├── Dockerfile
│   ├── Jenkinsfile
│   ├── manage.py
│   └── requirements.txt
│
├── villa/
│   ├── admin_app/
│   ├── builder_app/
│   ├── static/
│   ├── templates/
│   ├── user_app/
│   ├── villaproject/
│   ├── k8s/
│   │   ├── deployment.yaml
│   │   └── service.yaml
│   ├── .dockerignore
│   ├── .gitignore
│   ├── .semgrepignore
│   ├── Dockerfile
│   ├── Jenkinsfile
│   ├── manage.py
│   └── requirements.txt
│
├── evidence/
│   ├── mediplus/
│   │   ├── mediplus-semgrep.txt
│   │   ├── mediplus-trivy.txt
│   │   └── mediplus-dast.txt
│   ├── project4/
│   │   ├── project4-semgrep.txt
│   │   ├── project4-trivy.txt
│   │   └── project4-dast.txt
│   ├── complaintbox/
│   │   ├── complaintbox-semgrep.txt
│   │   ├── complaintbox-trivy.txt
│   │   └── complaintbox-dast.txt
│   ├── takecare/
│   │   ├── takecare-semgrep.txt
│   │   ├── takecare-trivy.txt
│   │   └── takecare-dast.txt
│   └── villa/
│       ├── villa-semgrep.txt
│       ├── villa-trivy.txt
│       └── villa-dast.txt
│
├── project/
│   ├── mediplus/
│   │   ├── 01-SAST/
│   │   ├── 02-Dependency-Scan/
│   │   ├── 03-DAST/
│   │   ├── 04-Jenkins-Pipeline/
│   │   ├── 05-Pipeline-Success/
│   │   └── 06-ArgoCD/
│   ├── project4/
│   │   ├── 01-SAST/
│   │   ├── 02-Dependency-Scan/
│   │   ├── 03-DAST/
│   │   ├── 04-Jenkins-Pipeline/
│   │   ├── 05-Pipeline-Success/
│   │   └── 06-ArgoCD/
│   ├── complaintbox/
│   │   ├── 01-SAST/
│   │   ├── 02-Dependency-Scan/
│   │   ├── 03-DAST/
│   │   ├── 04-Jenkins-Pipeline/
│   │   ├── 05-Pipeline-Success/
│   │   └── 06-ArgoCD/
│   ├── takecare/
│   │   ├── 01-SAST/
│   │   ├── 02-Dependency-Scan/
│   │   ├── 03-DAST/
│   │   ├── 04-Jenkins-Pipeline/
│   │   ├── 05-Pipeline-Success/
│   │   └── 06-ArgoCD/
│   └── villa/
│       ├── 01-SAST/
│       ├── 02-Dependency-Scan/
│       ├── 03-DAST/
│       ├── 04-Jenkins-Pipeline/
│       ├── 05-Pipeline-Success/
│       └── 06-ArgoCD/
│
├── .gitignore
└── README.md
