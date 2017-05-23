docker build -t students:dev .

docker login -u eastacr -p XS/Xr98wH=7=O+/j1w/=7iw2yWxdeRTI eastacr.azurecr.io

docker push student:dev

kubectl delete -f deployment.yml

kubectl create -f deployment.yml