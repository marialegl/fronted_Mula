package com.jetbrains.kmpapp.screens

import com.jetbrains.kmpapp.`data`.MuseumObject
import com.rickclephas.kmp.nativecoroutines.NativeFlow
import com.rickclephas.kmp.nativecoroutines.asNativeFlow
import com.rickclephas.kmp.observableviewmodel.coroutineScope
import kotlin.OptIn
import kotlin.native.ObjCName
import kotlinx.coroutines.ExperimentalCoroutinesApi

@OptIn(ExperimentalCoroutinesApi::class)
public val DetailViewModel.museumObjectFlow: NativeFlow<MuseumObject?>
  get() = museumObject.asNativeFlow(viewModelScope.coroutineScope)

@OptIn(ExperimentalCoroutinesApi::class)
@ObjCName(name = "museumObject")
public val DetailViewModel.museumObjectValue: MuseumObject?
  get() = museumObject.value
