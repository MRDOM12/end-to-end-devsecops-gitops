FROM python:3.12-slim

ENV PYTHONDONTWRITEBYTECODE=1
ENV PYTHONUNBUFFERED=1

WORKDIR /app

COPY requirements.txt .
RUN pip install --no-cache-dir -r requirements.txt

COPY . .

EXPOSE 8000

CMD ["sh", "-c", "MANAGE_PATH=$(find . -maxdepth 3 -name manage.py | head -n 1) && python $MANAGE_PATH migrate --noinput && python $MANAGE_PATH runserver 0.0.0.0:8000"]
