# I18n Demo

This app demonstrate how to do i18n in ActFramework application.

## Quick start

To start in dev mode:

```bash
cd /path/to/a/app
mvn clean compile exec:exec
```

To start in prod mode:

```bash
cd /path/to/a/app
mvn clean package
cd target/dist
unzip *.zip
./start
```

Once you started, navigate your browser to `http://localhost:5460` to play with the demo:

![demo-image](demo.gif)

## Support [I18n and I10n](https://www.w3.org/International/questions/qa-i18n) in Actframework

It is super easy to add support to i18n and i10n in your ActFramework application.

First you need to enable i18n support by adding the following setting into your application configuration property file:

```properties
i18n=true
```

Then add your [messages bundle properties](https://github.com/act-gallery/i18n/tree/master/src/main/resources):

![image](https://user-images.githubusercontent.com/216930/66710487-557b6080-edc5-11e9-8cdb-b7684ed2fbfb.png)

Finally coding your [HTML template]() using 

