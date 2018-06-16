# MongoDB

MongoDB is cross-platform document-oriented database program. Classified as a NoSQL database program, MongoDB uses JSON-like documents with schemas. Fields in a MongoDB document can be indexed with primary and secondary indices.

MongoDB supports field, range query, and regular expression searches. Queries can return specific fields of documents and also include user-defined JavaScript functions. JavaScript can be used in queries, aggregation functions (such as MapReduce), and sent directly to the database to be executed. 

MongoDB provides high availability with replica sets. A replica set consists of two or more copies of the data. Each replica set member may act in the role of primary or secondary replica at any time. All writes and reads are done on the primary replica by default. Secondary replicas maintain a copy of the data of the primary using built-in replication.

MongoDB can be used as a file system, called GridFS(Grid File System), with load balancing(MongoDB scales horizontally using sharding) and data replication features over multiple machines for storing files. MongoDB can run over multiple servers, balancing the load or duplicating data to keep the system up and running in case of hardware failure.

MongoDB supports fixed-size collections called capped collections. This type of collection maintains insertion order and once the specified size or limit has been reached, behaves like a circular queue. The current stable release does not support transactions, but transactions are scheduled to be available in a new upcomming releases.

Purpose of this repository is to explore feature of MongoDB in order to learn how to trigger near to real time queries on MongoDB using RESTful web_services & HTTP methods via examples.

