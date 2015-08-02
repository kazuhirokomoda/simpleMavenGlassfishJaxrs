# simpleMavenGlassfishJaxrs

This simple Java project tries to demonstrate an example of
 continuous integration (CI), which consists of the followings.
- Automated build
- Automated testing
- Static code analysis
- (Automated deploy)

## Motivation
While I was suffering from
 unexpected errors and manual build/deploy in big projects,
 I encountered [this blog post][pipeline].

> Build an automated deployment pipeline for your Java EE applications
 using leading open-source technologies,
 including NetBeans, Git, Maven, JUnit, Jenkins, and GlassFish.

> The three main goals of our deployment pipeline will be
 continuous integration, automated testing, and continuous deployment.
 Our objective is to automatically compile, test, assemble,
 and deploy our Java EE application to multiple environments,
 as the project progresses through the software development life cycle (SDLC).

This is just a simple project, but I hope I learn something
 which I can utilize in daily development.


## Environment

- VCS: Git
    - hosting service: GitHub
- sample app: AngularJS, Java (JAX-RS)
- dependency management: Maven
- app server: Glassfish
- CI tool: Jenkins
- development flow: GitHub flow


## Settings

### Install Jenkins plugins

- FindBugs Plugin
- Checkstyle Plugin
- Cobertura Plugin
- Copy Artifact Plugin
- Deploy Plugin (aka. Deploy to container Plugin) (for deploying to Glassfish)
- PMD Plugin (incl. CPD)
- DRY Plugin (aka. Duplicate Code Scanner Plug-in)

### pom.xml


### Configure Jenkins job(s)


[pipeline]: https://programmaticponderings.wordpress.com/2013/11/04/continuous-integration-and-deployment-using-git-maven-jenkins-and-glassfish/

