FROM python:3.8
ADD ./ /tests/
WORKDIR /tests/
RUN pip install --no-cache-dir -r requirements.txt

COPY wait-for-it.sh wait-for-it.sh
RUN chmod +x wait-for-it.sh