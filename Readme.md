Policy Based Cache - 
Requirements - 
Cache should be bounded in the number of keys.
Design it in a way so that it is easy to add the following to the library
eviction policy - which decides how to evacuate old data to make room for new data.
Data store - where it keeps key-value pairs.
Users of the cache should be able to specify data store & eviction policy at initialization.


Provided one implementation of Internal data store as HashMap and eviction strategy (LIFO - using Stack)
