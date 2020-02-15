#!/bin/sh

if [ "$1" = 'zeus-redis-cluster' ]; then
    sleep 10
    echo "yes" | redis-cli --cluster create 173.17.0.11:6379 173.17.0.12:6379 173.17.0.13:6379 173.17.0.14:6379 173.17.0.15:6379 173.17.0.16:6379 --cluster-replicas 1
    echo "DONE"
else
  exec "$@"
fi
