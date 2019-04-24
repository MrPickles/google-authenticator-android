package com.google.android.apps.authenticator;

import com.google.android.apps.authenticator.barcode.BarcodeCaptureActivity;
import com.google.android.apps.authenticator.timesync.SyncNowActivity;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public interface ComponentsModule {

  @ContributesAndroidInjector
  abstract AuthenticatorActivity contributeAuthenticatorActivity();

  @ContributesAndroidInjector
  abstract BarcodeCaptureActivity contributeBarcodeCaptureActivity();

  @ContributesAndroidInjector
  abstract SyncNowActivity contributeSyncNowActivity();
}
