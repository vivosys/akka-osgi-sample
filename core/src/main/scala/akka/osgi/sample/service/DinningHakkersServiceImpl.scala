/*
Copyright 2013 Crossing-Tech

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
   limitations under the License.
 */
package akka.osgi.sample.service

import akka.osgi.sample.api.DinningHakkersService
import akka.actor.{Props, ActorSystem}
import akka.osgi.sample.internal.Hakker

class DinningHakkersServiceImpl(system: ActorSystem) extends DinningHakkersService {
  def getHacker(name: String, chairNumber: Int) = {
    system.actorOf(Props(new Hakker(name, chairNumber)))
  }
}
