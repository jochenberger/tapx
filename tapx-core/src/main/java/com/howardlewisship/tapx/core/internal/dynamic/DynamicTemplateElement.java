// Copyright 2010 Howard M. Lewis Ship
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.howardlewisship.tapx.core.internal.dynamic;

import org.apache.tapestry5.MarkupWriter;
import org.apache.tapestry5.runtime.RenderCommand;
import org.apache.tapestry5.runtime.RenderQueue;

import com.howardlewisship.tapx.core.dynamic.BlockSource;
import com.howardlewisship.tapx.core.dynamic.DynamicTemplate;

/**
 * A close cousin to {@link RenderCommand} used inside a {@link DynamicTemplate}.
 */
public interface DynamicTemplateElement
{
    /**
     * The element should perform whatever rendering it wants. When rendering elements, the queue
     * is used to queue up rendering commands for the body of the element as well as a command to close
     * the element started.
     */
    void render(MarkupWriter writer, RenderQueue queue, BlockSource blockSource);
}
