# Copyright 2019 Google LLC
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

package(
    default_visibility = [
        "//java/com/google/android/apps/authenticator:__subpackages__",
        "//javatests/com/google/android/apps/authenticator:__subpackages__",
    ],
)

licenses(["notice"])  # Apache 2.0

java_plugin(
    name = "dagger-component-processor",
    processor_class = "dagger.internal.codegen.ComponentProcessor",
    deps = [
        "@maven//:com_google_dagger_dagger_compiler",
    ],
)

java_plugin(
    name = "dagger-android-processor",
    processor_class = "dagger.android.processor.AndroidProcessor",
    deps = [
        "@maven//:com_google_dagger_dagger_android_processor",
    ],
)
