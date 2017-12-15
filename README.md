# smarthome

Implemented using 
Spring-boot
Java 8
MongoDB
Maven
Spring data


Modules :
1. Core module - Provides interfaces and implementation for operating various elements of the problem statement.
2. Data module - To interact with persistent layer. MongoDb in this case.
3. Score module - To score different elements such as Homes, Devices etc
4. Badge - Provide Badges based on achieving goals.
5. Goal -  Set goals & goal templates for homes.
6. Track - Analyse the data consumption by each device and home.

Even Though, implementation is monolithic type for POC, the idea is to implement Microservice based architecture to accommodate each module as a separate microservice. This helps to scale the system and add new modules as needed.


Implementation Approach
-Considered various elements of the problem statement such as 
EnergySource, Sustainable Energy, Devices running on Energy and Home.

- Devices are of two types
1. Single Consumption Device
2. Multi Consumption Device

Single Consumption Device consumes any one type of sustainable energy, which may have multiple sources. For instance, Power can be sourced from Solar Power, Thermal, Water Or Wind.

Similarly, a MultiConsumptionDevice powers by multiple energies and each energy can be sourced through multiple sources.
For instance, a washing machine requires both water and power to run. And each energy may be sourced from multiple sources.

- System supports CRUD of multiple homes, devices to each home, energy and sources for each device. In addition, each repository supports relevant operations. 

- Creating a home
  Using builder pattern to build a home instance.
  
- Creating a Device
- Similarly use builder pattern and Factory pattern to create required instances based on incoming request. For ex: Single Consumption or Multi Consumption.

- Event listeners & Publishers
  Listeners listen for each event such as Registering a home, device etc as well as starting and stopping a device.
  Listened events gets published/stored to DB for tracking purpose.

- Device status
- At any given time frame any device can be either at START state or STOP state.
- Making use of State Design pattern to track the state of a given device and consequently publish the data.

- For instance, when a device is started, device start is aware of the time of start, device started, and other metadata. Once received a request to stop the device next state would be Stop device and amount of time taken, energy consumed and soure of energy for each energy type are published to storage.

- Systems supports additional attribute data at Device, Home, Energy and Energy Source level through a custom AttributeData data structure.
- Implementation is extendable for creating new types of device, homes, energies and energy sources without changing existing code.

- Repositories & Services
 Both Repository and Service layer provides required abstraction to avoid redundancy in coding. For instance, Repository layer user BaseRepository to abstract out basic operations required for all child repositories. This avoid duplicate code at derived level, and encapsulate implementation details from calling class. The same approach is followed for Service Layer.
 
 - Strategy will be used at repository layer to provide multiple implementations based on persistence layer adoption. For instance, for Mongo, Cassandra etc.
 


DB Model-
Available in docs folder and briefly explained the mapping below.

- various Entities:
Home
Device
DeviceEnergyData
DeviceConsumption
ConsumptionData
Energy
EnergySource

- Home -> Device : One to Many 
- Device ->DeviceEnergyData: One To Many
- DeviceConsumption->Device : Many To One
- DeviceConsumption->ConsumptionData :One To Many
- ConsumptionData ->Energy :One To One
- ConsumptionData->EnergySource :One To Many

Why Mongo:
- For Aggregating data
- Supports object model
- Even Though write speeds are comparatively lesser than Cassandra, considering object modeling preferred Mongo.

Disadvantages:
Downtime due to Single Master model, if master is down. Where as Cassandra supports multiple master model.

# TODO
Class diagram will be uploaded soon

# TODO
Sequence diagram, for various flows such as creation of device, home, and tracking energy consumption, will be uploaded soon.

# TODO
MongoDB Domain model will be uploaded soon.





