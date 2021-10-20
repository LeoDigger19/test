package games.absolutephoenix.atlasservermanager;

/*
The MIT License (MIT)

Copyright (c) 2021 Absolute_Phoenix

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
documentation files (the "Software"), to deal in the Software without restriction, including without limitation the
rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit
persons to whom the Software is furnished to do so, subject to the following conditions:
1: All products using this code may not make revenue.
2: Any project using this project or significant portions of this project must give credit to the original copyright holder.
*/

import games.absolutephoenix.atlasservermanager.functions.AtlasServerFunctions;
import games.absolutephoenix.atlasservermanager.userinterface.SplashScreen;
import games.absolutephoenix.atlasservermanager.utils.HelperMethods;


public class AtlasServerManager {

    public static void main(String[] args)
    {
        SplashScreen splashScreen = new SplashScreen();
        InstallRequiredPrograms(splashScreen);
        splashScreen.setTask("Startup Tasks complete!");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        splashScreen.Destroy();

    }

    private static void InstallRequiredPrograms(SplashScreen splashScreen)
    {
        //Install SteamCMD
        splashScreen.setTask("Checking for SteamCMD.");
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(HelperMethods.CheckForSteamCMD()) {
            splashScreen.setTask("SteamCMD is installed.");
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else {
            splashScreen.setTask("SteamCMD not found.");
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            splashScreen.setTask("Downloading and installing SteamCMD. (Please wait, depending on your internet this could take a bit.)");
            AtlasServerFunctions.InstallSteamCMD();
            splashScreen.setTask("SteamCMD is now installed.");
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //Install Atlas
        splashScreen.setTask("Checking for Atlas.");
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(HelperMethods.CheckForAtlas()) {
            splashScreen.setTask("Atlas is installed.");
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else {
            splashScreen.setTask("Atlas not found.");
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            splashScreen.setTask("Downloading and installing Atlas. (Please wait, depending on your internet this could take a bit.)");
            AtlasServerFunctions.InstallAtlas();
            splashScreen.setTask("Atlas is now installed");
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //Install Server Grid
        splashScreen.setTask("Checking for Server Grid Editor.");
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(HelperMethods.CheckForServerGridEditor()) {
            splashScreen.setTask("Server Grid Editor is installed.");
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else {
            splashScreen.setTask("Server Grid Editor not found.");
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            splashScreen.setTask("Downloading Server Grid Editor.");
            AtlasServerFunctions.InstallAtlasServerGridEditor();
            splashScreen.setTask("Server Grid Editor is now installed");
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}