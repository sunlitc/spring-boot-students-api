#!/usr/bin/env bash
docker rmi students:dev

docker build -t <registry_name> .

docker login -u <registry-username> -p <registry-password> <registry-name>

docker push <registry-image>

kubectl delete -f deployment.yml

kubectl create -f deployment.yml