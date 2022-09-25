FROM postgres:13.3
ENV POSTGRES_PASSWORD=devschool
ENV POSTGRES_DB=devschool
ADD init.sql /docker-entrypoint-initdb.d/
EXPOSE 5432:5432