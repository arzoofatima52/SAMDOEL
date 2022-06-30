package com.github.finaloel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.accessibility.AccessibilityEvent;
import static android.media.AudioManager.*;
public class MUSIC extends AccessibilityService {

        private AudioManager audioManager =
                (AudioManager) getSystemService(AUDIO_SERVICE);

        @Override
        public void onAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            AccessibilityNodeInfo interactedNodeInfo =
                    accessibilityEvent.getSource();
            if (interactedNodeInfo.getText().equals("PLAY")) {
                audioManager.adjustStreamVolume(AudioManager.STREAM_ACCESSIBILITY,
                        ADJUST_RAISE, 0);
            }
        }
    }
