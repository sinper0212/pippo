/*
 * Copyright (C) 2014 the original author or authors.
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
package ro.fortsoft.pippo.demo.template;

import ro.fortsoft.pippo.core.Pippo;
import ro.fortsoft.pippo.jade.JadeTemplateEngine;

/**
 * @author Decebal Suiu
 */
public class JadeDemo {

    public static void main(String[] args) {
        // .jade is the default file extension
        Pippo pippo = new Pippo(new TemplateApplication(new JadeTemplateEngine(), "jade/hello"));
        pippo.start();
    }

}