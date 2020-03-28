### Communication Network DB

Describe communication network as jpa objects:
- Node, consist of connectors as router.
- Connector is cable device, consist of points as router board.
- Point is plug, into which one wire can be connected.
- Link is wire, connect two dots as cable.

Node has ID, name, region, street, house.
Connector has ID, name and capacity (in points).
Point identify number in connector (from zero)
Link defined two points deference connectors:
` SourcePoint, TargetPoint, SourceConnector, TargetConnector`

#### Task:
Develop entity beans, connect with jpa annotations

#### Result in
- Entity package as source files.
- Example populate database with temp data.

Populate DB is `resources/populatedb.sql`

### Run this
```
git clone http://github.com/witalijbukatkin/communicationdb
mvn package
java -jar target/*-jar-with-dependencies.jar
```