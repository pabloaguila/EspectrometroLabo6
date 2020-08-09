package com.example.android.camera2.basic.fragments;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.android.camera2.basic.R;

public class LongOndaFragmentDirections {
  private LongOndaFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionLongOndaFragmentToPermissionsFragment() {
    return new ActionOnlyNavDirections(R.id.action_longOndaFragment_to_permissions_fragment);
  }
}
