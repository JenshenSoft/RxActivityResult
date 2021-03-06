/*
 * Copyright 2016 Copyright 2016 Víctor Albertos
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package rx_activity_result;

import android.content.Intent;

class Request {
    private final Intent intent;
    private OnPreResult onPreResult;
    private OnResult onResult;

    Request(Intent intent) {
        this.intent = intent;
    }

    void setOnPreResult(OnPreResult onPreResult) {
        this.onPreResult = onPreResult;
    }

    OnPreResult onPreResult() {
        return onPreResult;
    }

    void setOnResult(OnResult onResult) {
        this.onResult = onResult;
    }

    OnResult onResult() {
        return onResult;
    }

    Intent intent() {
        return intent;
    }
}
