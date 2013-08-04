package com.WifiAudioDistribution;

import java.io.File;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Pod {
    private ClientManager mManager;
    private List<Socket> mSockets;
    private File mFile;

    public Pod(ClientManager manager) {
        mManager = manager;
        mSockets = new ArrayList<Socket>();
    }

    public void setFile(File playbackFile) {
        mFile = playbackFile;
    }

    public void run() {

    }

    public void stopPlayback() {

    }
}