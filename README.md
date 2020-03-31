### Communication Network Web

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
1. Develop entity beans, connect with jpa annotations
2. Create website of two pages on ejb and jsp

#### Result in
- Entity package as source files.
- Example populate database with temp data.

Populate DB is `resources/populatedb.sql`

### Run this in *nix
```
git clone http://github.com/witalijbukatkin/communicationweb
mvn package cargo:run
```
Connect to host from browser:
`http://{you_ip}:8080/web`

IP Address can find out like this:
`hostname -I`