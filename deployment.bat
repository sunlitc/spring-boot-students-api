docker rmi students:dev

docker build -t <registry_name> .

docker login -u <registry-username> -p <registry-password> <>

docker push <registry-image>

kubectl delete -f deployment.yml

kubectl create -f deployment.yml