## Introduction

The Unity-ACRA plugin easily lets you keep track of crashes that have been caused by your native Java code by using ACRA.

## Installation & Setup

The following steps illustrate how to integrate the Unity-ACRA plugin:

### 1) Download and build Unity-ARCA
Change the value for **fromeurl** inside the ExtendedApplication.java to the your crash report url.
![alt text](Documentation/changeurl.png  "change server url")

### 2) Import plugin
Copy the **UnityARCA\bin\unityarca.jar** folder into the **Assets\Plusgings** directory of your Unity project
Unity
![alt text](Documentation/add_plugin1.png  "Add plugins folders")
![alt text](Documentation/add_plugin2.png  "Add plugins folders")

### 3) Modify AndroidManifest.xml
add the value for **application\android:name** for  the AndroidManifest.xml (*Assets/Plugins/Android*) to "com.example.unityarca.ExtendedApplication".

![alt text](Documentation/modify_manifest.png  "Add plugins folders")
