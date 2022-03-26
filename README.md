# receiverAPI
 Reciever API for NatWest Challenge


The Base64 encrypted data is received by the receiver API and then decoded and parsed to JSON format mapping it to Transaction object. It is then persisted in the H2 Database using Repository interface that exetends the JPA Repository. 
