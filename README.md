# st-market-back


```
➜  tree 

├── main
│   ├── java
│   │   └── com
│   │       └── cafeto
│   │           └── challenge
│   │               ├── api
│   │               │   ├── commons
│   │               │   │   ├── Constants.java
│   │               │   │   ├── ControllerBase.java
│   │               │   │   └── ServiceBase.java
│   │               │   └── security
│   │               │       ├── helper
│   │               │       │   ├── AESCipher.java
│   │               │       │   ├── DefaultAESCipher.java
│   │               │       │   ├── DefaultSecretKeyProvider.java
│   │               │       │   └── SecretKeyProvider.java
│   │               │       ├── JwtAuthenticationEntryPoint.java
│   │               │       ├── JwtRequestFilter.java
│   │               │       ├── model
│   │               │       │   ├── JwtRequest.java
│   │               │       │   └── JwtResponse.java
│   │               │       ├── service
│   │               │       │   ├── CipherService.java
│   │               │       │   ├── JwtTokenHelper.java
│   │               │       │   └── JwtUserDetailsService.java
│   │               │       └── WebSecurityConfig.java
│   │               ├── CafetoChallengeApplication.java
│   │               ├── city
│   │               │   ├── controller
│   │               │   │   └── CityController.java
│   │               │   ├── model
│   │               │   │   └── City.java
│   │               │   ├── repository
│   │               │   │   └── CityRepository.java
│   │               │   └── service
│   │               │       ├── CityServiceHandler.java
│   │               │       └── CityService.java
│   │               ├── clinic
│   │               │   ├── controller
│   │               │   │   └── ClinicController.java
│   │               │   ├── model
│   │               │   │   └── Clinic.java
│   │               │   ├── repository
│   │               │   │   └── ClinicRepository.java
│   │               │   └── service
│   │               │       ├── ClinicServiceHandler.java
│   │               │       └── ClinicService.java
│   │               ├── clinicType
│   │               │   ├── controller
│   │               │   │   └── ClinicTypeController.java
│   │               │   ├── model
│   │               │   │   └── ClinicType.java
│   │               │   ├── repository
│   │               │   │   └── ClinicTypeRepository.java
│   │               │   └── service
│   │               │       ├── ClinicTypeServiceHandler.java
│   │               │       └── ClinicTypeService.java
│   │               ├── nephrologist
│   │               │   ├── controller
│   │               │   │   └── NephrologistController.java
│   │               │   ├── model
│   │               │   │   └── Nephrologist.java
│   │               │   ├── repository
│   │               │   │   └── NephrologistRepository.java
│   │               │   └── service
│   │               │       ├── NephrologistServiceHandler.java
│   │               │       └── NephrologistService.java
│   │               ├── nephrologistBaseClinic
│   │               │   ├── controller
│   │               │   │   └── NephrologistBaseClinicController.java
│   │               │   ├── model
│   │               │   │   └── NephrologistBaseClinic.java
│   │               │   ├── repository
│   │               │   │   └── NephrologistBaseClinicRepository.java
│   │               │   └── service
│   │               │       ├── NephrologistBaseClinicServiceHandler.java
│   │               │       └── NephrologistBaseClinicService.java
│   │               ├── nephrologistType
│   │               │   ├── controller
│   │               │   │   └── NephrologistTypeController.java
│   │               │   ├── model
│   │               │   │   └── NephrologistType.java
│   │               │   ├── repository
│   │               │   │   └── NephrologistTypeRepository.java
│   │               │   └── service
│   │               │       ├── NephrologistTypeServiceHandler.java
│   │               │       └── NephrologistTypeService.java
│   │               ├── user
│   │               │   ├── controller
│   │               │   │   └── UserController.java
│   │               │   ├── model
│   │               │   │   └── User.java
│   │               │   ├── repository
│   │               │   │   └── UserRepository.java
│   │               │   └── service
│   │               │       ├── UserServiceHandler.java
│   │               │       └── UserService.java
│   │               └── zone
│   │                   ├── controller
│   │                   │   └── ZoneController.java
│   │                   ├── model
│   │                   │   └── Zone.java
│   │                   ├── repository
│   │                   │   └── ZoneRepository.java
│   │                   └── service
│   │                       ├── ZoneServiceHandler.java
│   │                       └── ZoneService.java
│   └── resources
│       ├── application.integration.properties
│       └── application.properties
└── test
    └── java
        └── com
            └── cafeto
                └── challenge
                    ├── GlobalTest.java
                    ├── helper
                    │   ├── CafetoMockBase.java
                    │   ├── CleanUpTest.java
                    │   └── MockMvcComponent.java
                    └── modularTest
                        ├── CityTest.java
                        ├── ClinicTest.java
                        ├── ClinicTypeTest.java
                        ├── NephrologistBaseClinicTest.java
                        ├── NephrologistTest.java
                        ├── NephrologistTypeTest.java
                        ├── UserTest.java
                        └── ZoneTest.java

59 directories, 70 files

```
