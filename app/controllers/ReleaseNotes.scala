/**
 * Copyright 2010-2013 Artima, Inc.
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
package controllers

import play.api._
import play.api.mvc._

object ReleaseNotes extends Controller {

  def releaseNotesIndex = Action {
    Ok(views.html.releaseNotes.releaseNotesIndex())
  }

  def v215 = Action {
    Ok(views.html.releaseNotes.v215())
  }

  def v214 = Action {
    Ok(views.html.releaseNotes.v214())
  }

  def v213 = Action {
    Ok(views.html.releaseNotes.v213())
  }

  def v212 = Action {
    Ok(views.html.releaseNotes.v212())
  }

  def v211 = Action {
    Ok(views.html.releaseNotes.v211())
  }

  def v210 = Action {
    Ok(views.html.releaseNotes.v210())
  }

  def v20 = Action {
    Ok(views.html.releaseNotes.v20())
  }
}
