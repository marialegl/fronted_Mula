package com.jetbrains.screens.screens

import com.jetbrains.screens.`data`.MuseumObject
import com.rickclephas.kmp.nativecoroutines.NativeFlow
import com.rickclephas.kmp.nativecoroutines.asNativeFlow
import com.rickclephas.kmp.observableviewmodel.coroutineScope
import kotlin.collections.List
import kotlin.native.ObjCName

public val ListViewModel.objectsFlow: NativeFlow<List<MuseumObject>>
  get() = objects.asNativeFlow(viewModelScope.coroutineScope)

@ObjCName(name = "objects")
public val ListViewModel.objectsValue: List<MuseumObject>
  get() = objects.value
