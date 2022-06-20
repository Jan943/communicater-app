# ElectronicsApp
Two app communicating between each other by API<br/>

The part of work which I don't include because of lack of need to create another repository in GitHub and I think that the way is more readable.<br/>So we create new project in Intellij IDEA and name it "spring-api-client"

1.Create configuration class in Spring.<br/>
2.Copy class's models from first project (in our case it is Computer and MobilePhone class).<br/>
3.In ComputerClient and MobilePhoneClient class create proper methods to communication with API of another project and serve it (I use mainly as class as : RestTemplate and ResponseEntity and HttpHeader).<br/>

![api-client](https://user-images.githubusercontent.com/46823541/174681603-eb0fc671-18fa-41cc-814b-c4954f7d727d.png)
