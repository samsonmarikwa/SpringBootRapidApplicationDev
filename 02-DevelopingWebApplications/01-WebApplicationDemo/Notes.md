Static content should be in the folder src/main/resources/static

Static content should not be put in src\main\web folder if you web app is going to be packaged as a jar. Although the directory is a common standard, it will only work with war packaging and will be ignored by build tools.

Template Engines, should be avoided. With default configurations, the templates will be picked up from src/main/resources/templates
