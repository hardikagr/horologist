/*
 * Copyright 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.android.horologist.ai.sample.phone.service

import com.google.android.horologist.ai.core.BindableAiGrpcService
import com.google.android.horologist.ai.sample.wear.gemini.service.GeminiSDKInferenceServiceImpl
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class InferenceBinderGrpcServiceImpl : BindableAiGrpcService() {
    @Inject
    override lateinit var bindableService: GeminiSDKInferenceServiceImpl
}
