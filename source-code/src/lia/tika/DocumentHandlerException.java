package lia.tika;

/**
 * Copyright Manning Publications Co.
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
 * See the License for the specific lan      
*/

import java.io.PrintStream;
import java.io.PrintWriter;

// From chapter 7
public class DocumentHandlerException extends Exception {
  private Throwable cause;

  /**
   * Default constructor.
   */
  public DocumentHandlerException() {
    super();
  }

  /**
   * Constructs with message.
   */
  public DocumentHandlerException(String message) {
    super(message);
  }

  /**
   * Constructs with chained exception.
   */
  public DocumentHandlerException(Throwable cause) {
    super(cause.toString());
    this.cause = cause;
  }

  /**
   * Constructs with message and exception.
   */
  public DocumentHandlerException(String message, Throwable cause) {
    super(message, cause);
  }

  /**
   * Retrieves nested exception.
   */
  public Throwable getException() {
    return cause;
  }

  public void printStackTrace() {
    printStackTrace(System.err);
  }

  public void printStackTrace(PrintStream ps) {
    synchronized (ps) {
      super.printStackTrace(ps);
      if (cause != null) {
        ps.println("--- Nested Exception ---");
        cause.printStackTrace(ps);
      }
    }
  }

  public void printStackTrace(PrintWriter pw) {
    synchronized (pw) {
      super.printStackTrace(pw);
      if (cause != null) {
        pw.println("--- Nested Exception ---");
        cause.printStackTrace(pw);
      }
    }
  }
}
