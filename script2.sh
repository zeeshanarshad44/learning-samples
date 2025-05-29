!/bin/bash

echo "Type your username"
read username
echo "Type your password"
read password

if [[ ( $username == "admin" && $password == "secret" ) ]]; then
echo "Authorized user"
else
echo "Unauthorized user"
fi
