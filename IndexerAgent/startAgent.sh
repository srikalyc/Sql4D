#!/bin/bash
if [ $# -ne 1 ]; then
    echo "Need path to indexer configuration..."
    exit 1
fi

java -cp target/IndexerAgent-*.jar com.yahoo.sql4d.indexeragent.Agent $1
